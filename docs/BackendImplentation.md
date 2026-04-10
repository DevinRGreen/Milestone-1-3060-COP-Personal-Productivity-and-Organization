# Personal Productivity and Organization Web App

## Overview
This project is a full-stack web application designed to help users manage tasks, deadlines, and personal goals in a centralized system. The backend is built using Spring Boot and focuses on structuring models, services, and repositories to support future database integration.

---

## Backend Implementation

### Models
The system includes three core models:

- **User**
  - id
  - name
  - email
  - password

- **Task**
  - id
  - title
  - description
  - due_date
  - priority
  - status
  - user_id (relationship to User)

- **Reminder**
  - id
  - message
  - reminder_time
  - task_id (relationship to Task)

** Relationships:
- One User can have many Tasks
- One Task can have many Reminders

---

### Repositories
Repository interfaces are defined for each model:

- UserRepository
- TaskRepository
- ReminderRepository

These define data access methods but are not yet connected to a database.

---

### Services
Each model has a corresponding service layer:

- **UserService**
  - Create user
  - Retrieve user
  - Update user

- **TaskService**
  - Create task
  - Retrieve tasks
  - Delete task

- **ReminderService**
  - Create reminder
  - Retrieve reminders
  - Delete reminder

These services organize business logic and simulate application behavior.

---

### Controllers (Optional)
Basic controller stubs are included:

- UserController
- TaskController
- ReminderController

These define API endpoints but are not fully connected to persistence.

