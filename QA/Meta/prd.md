# 📄 Product Requirements Document (PRD)

## 🟢 Business Context

- **Problem:**
    1. Support team spend much time to answer tickets because documentation is sparse and very big.
    2. Project manager wants to reduce time to create requirements as user stories, issues for project tracking.
    3. Team leader wants to track completeness of requirements, productivity of each member.
    4. All discussions are happened in common Telegram chats and can be observable to integrate with Github issue tracker.
    5. Full integration of all information flows between project's documentation, Github issues tracker, Telegram chats and code base:
       5.1. Project documentation is more stable and included proved information.
       5.2. Github issues tracker is more often updated by project manager and team leader.
       5.3. Telegram chats are very intensive place for discussions.
       5.4. Github code base includes code of all projects.
- **Opportunity:**
    1. Project manager would like to see predicted requirements, issues from Telegram chats to create them in Github.
    2. Team leader can track completeness of requirements from Telegram chats to setup tasks, see feedback and monitor progress.
    3. Project manager can track completeness of requirements and productivity of each member based on their code uploads in Github codebase.
    4. Technical writer can make predicted documentation updates based on proved changes from codebase.
- **Primary KPI:**
    1. Reduce time to create requirements, issues for project tracking.
    2. Track completeness of requirements, productivity of each member based on actual creation with code examples.
    3. Reduce time to answer tickets because documentation is sparse and very big.
    4. Reduce time to update documentation based on predicted changes from Telegram and codebase.

## 🎯 High-level Goals

Create functional requirements based on business context which covers:
– Setup RAG process and make index of docs, codebase and Telegram chats.
– Save all information in Postgres database for semantic and full-text search for RAG purpose.
– Make requirement's prediction from codebase and Telegram chats.

- Monitor productivity of each member based on their code impacts in Github codebase.
- Make predicted documentation updates based on codebase changes.

