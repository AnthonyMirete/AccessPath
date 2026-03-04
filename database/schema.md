# Database Schema – AccessPath

This schema defines the database structure for storing accessibility route information.

## Routes
Stores basic route information.

- route_id (Primary Key)
- name
- description
- created_by
- created_at

## RoutePoints
Stores GPS coordinates for each route.

- point_id (Primary Key)
- route_id (Foreign Key)
- latitude
- longitude
- point_order

## AccessibilityFeatures
Stores accessibility details about routes.

- feature_id (Primary Key)
- route_id (Foreign Key)
- surface_type
- slope
- has_curb_ramp
- has_stairs
- notes
