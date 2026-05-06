# Atlas Svc Cache Hub Walkthrough

This note is the quickest way to read the extra review model in `atlas-svc-cache-hub`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 211 | ship |
| stress | retry load | 154 | ship |
| edge | worker slack | 191 | ship |
| recovery | session drift | 120 | watch |
| stale | queue pressure | 211 | ship |

Start with `baseline` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around retry load and session drift.
