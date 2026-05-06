# atlas-svc-cache-hub

`atlas-svc-cache-hub` explores backend services with a small Kotlin codebase and local fixtures. The technical goal is to design a Kotlin verification harness for cache systems, covering policy evaluation, deny and allow fixtures, and failure-oriented tests.

## Why I Keep It Small

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how queue pressure and worker slack should influence a review result.

## Atlas Svc Cache Hub Review Notes

`baseline` and `recovery` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Included Behavior

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/atlas-svc-cache-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `session drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Internal Model

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Kotlin addition stays small enough to inspect in one sitting.

## Try It Locally

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Validation

The same command runs the local verification path. The highest-scoring domain case is `baseline` at 211, which lands in `ship`. The most cautious case is `recovery` at 120, which lands in `watch`.

## Scope

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
