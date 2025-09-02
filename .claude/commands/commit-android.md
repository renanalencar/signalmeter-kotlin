---
allowed-tools: Bash(git diff:*), Bash(git log:*)
description: Write a comprehensive commit message`.
---


## Context

- Current git status: !`git status`
- Recent changes: !`git diff`
- Recent commits: !`git log --oneline -5`
- Current branch: !`git branch --show-current`

## Your task
    You should provide commit message using format: `$ARGUMENTS - <type>(<scope>): <description>`

    ## Types
    `feat` `fix` `docs` `style` `refactor` `test` `chore` `perf` `ui` `security` `deps`

    ## Common Scopes
    `activity` `fragment` `viewmodel` `repository` `network` `database` `auth` `ui` `gradle` `manifest`

    ## Rules
    - **Be direct**: What changed, not why
    - **Use imperative mood**: "add", "fix", "update"
    - **Include key Android terms**: Room, Compose, Retrofit, etc.

    ## Examples

    -- feat(auth): add OAuth2 login
    -- fix(db): resolve Room migration crash
    -- ui: update Material3 buttons
    -- refactor(vm): extract user repository
    -- perf(list): optimize RecyclerView adapter
    -- deps: update Compose to 1.5.0

    You should not include any info about yourself (Generated with,  Co-Authored-By, etc)
