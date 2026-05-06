# Atlas Svc Cache Hub Failure Table

| Case | Focus | Expected Lane |
| --- | --- | --- |
| g001 | queue pressure | hold |
| g002 | retry load | watch |
| g003 | worker slack | ship |
| g004 | session drift | ship |
| g005 | queue pressure | ship |
| g006 | retry load | watch |
| g007 | worker slack | watch |
| g008 | session drift | watch |
| g009 | queue pressure | hold |
| g010 | retry load | ship |
| g011 | worker slack | ship |
| g012 | session drift | ship |

Use this table when a verifier failure is hard to read from the raw CSV.
