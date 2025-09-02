---
allowed-tools: Bash(git diff:*), Bash(git log:*)
description: Perform a comprehensive code review of recent changes
---

## Context

- Current git status: !`git status`
- Recent changes: !`git diff`
- Recent commits: !`git log --oneline -5`
- Current branch: !`git branch --show-current`


## Your task

1. Perform a comprehensive code review focusing on:
   1.1. **Code Quality**: Check for readability, maintainability, and adherence to best practices
   1.2. **Security**: Look for potential vulnerabilities or security issues
   1.3. **Performance**: Identify potential performance bottlenecks
   1.4. **Testing**: Assess test coverage and quality
   1.5. **Documentation**: Check if code is properly documented

Provide specific, actionable feedback with line-by-line comments where appropriate.

2. Generate a summary of your findings in the end of the tasks with a numbered list for each specific recommendations.
