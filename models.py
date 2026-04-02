from sqlalchemy import Column, Integer, String, Float, Boolean, DateTime; from geoalchemy2 import Geometry; from datetime import datetime; from database import Base
class AccessibilityReport(Base):
  __tablename__ = "accessibility_reports"
  description = Column(String)
  issue_type = Column(String)
  latitude = Column(Float)
  longitude = Column(Float)
  verified = Column(Boolean, default=False)
  created_at = Column(DateTime, default=datetime.utcnow)
class AccessibleLocation(Base):
  __tablename__ = "accessible_locations"
  id = Column(Integer, primary_key=True)
  name = Column(String)
  category = Column(String)
  geom = Column(Geometry("POINT"))
  wheelchair_accessible = Column(Boolean)
