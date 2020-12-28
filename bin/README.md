# Repairs Application [![CircleCI](https://circleci.com/gh/gardncl/repairs.svg?style=svg)](https://circleci.com/gh/gardncl/repairs)


# User Requirements

As a user I want to track the price of owning my vehicle.
 * Total cost
 * By calendar year
 * By milage
 * Per mile
 * Projected costs down the line
 * Estimate time by current driving habits

As a user I want a way to add my vehicle costs
 * Maintenance
 * Gas
 * Car wash
 * Insurance
 * Taxes

As a user I want to store any documents associated with my vehicle

As a new user I want to bulk upload previously recorded costs

As a user I want to attach or replace paperwork on a cost

As a user I want to change date/price/etc for a cost if I’ve incorrectly or never entered it

# Product Requirements Document

This application
Stores costs for users
Price, description, date, milage
Documents associated
Bulk upload
Retrieves costs for users
Projects costs for users
By date
By milage

### Milestone 1: Infrastructure - No dependencies
Web application
Continuous Integration/Continuous Deployment pipeline

### Milestone 2: Create database schema to capture relational data - Depends on milestone 1
Database
User
First name (nullable)
Last name (nullable)
Email
User identifier (email?)
Car
VIN
Make
Model
Year
Cost
Unique identifier (UUID)
Tag
Enum - Gas, taxes, car wash, insurance, maintenance, purchase
Description
free form text
Price
Date (nullable)
Milage (nullable)
Owners
Email
VIN
Expenses
VIN
Email
Cost id


### Milestone 3: Users and Vehicles - Depends on Milestone 2
Endpoint that takes a user, car information
Endpoint for adding cost to existing car
Retrieve costs by vehicle and user
Retrieve vehicles by user

## Epic 1 is Milestones 1, 2, and 3 - Minimal Viable Product released to users

### Milestone 4: Setup S3 - Depends on Milestone 1
Setup S3 with endpoints to upload and download

### Milestone 5: Bulk upload - Depends on Milestone 3 and 4
Uploads CSV to S3 for user
New table to store bulk upload
Insert many different costs for a user and car
Define the table template for the upload
Endpoint to retrieve the table template

### Milestone 6: Document store - Depends on Milestone 3 and 4
Add column to Cost with nullable document location link
Augment endpoint for adding cost to car to take document
Milestone 7: Project costs - Depends on Milestone 3


