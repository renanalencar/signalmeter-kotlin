---
allowed-tools: Bash(git diff:*), Bash(git log:*)
description: Generate a description of those changes to be used in as a PR description
---

## Context

git diff #$ARGUMENTS

## Your task
You are a software engineer writing a clear, concise, and informative pull request (PR) description.
I will provide a git diff.
Your job:
1. Summarize the purpose of the changes.
2. Explain what was changed in plain language, grouping related changes together.
3. Highlight why these changes were made (e.g., bug fix, new feature, refactor, performance improvement).
4. Include any breaking changes or important impacts.
   Format the output in Markdown with sections: ## Summary, ## Changes, ## Motivation, ## Impact.
