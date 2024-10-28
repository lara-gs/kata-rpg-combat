# Kata RPG Combat

## Background
This is a fun kata that has the programmer building simple combat rules, as for a role-playing game (RPG). It is implemented as a sequence of iterations. The domain doesn't include a map, kills, or any characters apart from their ability to damage and heal one another.

## Required
- **Minimum Java:** 17
- **DevDependency:**
  - JUnit
  - Hamcrest

## Installation
Just clone the Kata.

## Instructions
1. Complete each iteration before reading the next one.
2. It's recommended you perform this kata with a pairing partner and while writing tests.

---

## Iteration One:
All Characters, when created, have:
- **Health:** Starting at 1000
- **Level:** Starting at 1
- **Alive Status:** Starting Alive (Alive may be a true/false)

### Character Actions:
- **Deal Damage:** Damage is subtracted from Health.
- **Health Reduction:** When damage received exceeds current Health, Health becomes 0, and the character dies.
- **Heal:** A Character can Heal another Character.
  - **Note:** Dead characters cannot be healed.
  - **Healing Limit:** Healing cannot raise health above 1000.

---

## Iteration Two:
- A Character cannot **Deal Damage** to itself.
- A Character can only **Heal** itself.

### Damage Modifiers:
- When dealing damage:
  - If the target is **5 or more Levels above** the attacker, Damage is reduced by **50%**.
  - If the target is **5 or more Levels below** the attacker, Damage is increased by **50%**.

---

## Iteration Three:
- Characters have an **Attack Max Range**:
  - **Melee fighters:** Range of 2 meters.
  - **Ranged fighters:** Range of 20 meters.

### Range Requirement:
- Characters must be **in range** to deal damage to a target.

---

## Retrospective:
- Are you keeping up with the requirements? Has any iteration been a big challenge?
- Do you feel good about your design? Is it scalable and easily adapted to new requirements?
- Is everything tested? Are you confident in your code?

---

## Iteration Four:
- Characters may belong to **one or more Factions**.
- Newly created Characters belong to **no Faction**.
- A Character may **Join** or **Leave** one or more Factions.

### Faction Rules:
- Players belonging to the same Faction are considered **Allies**.
  - **Allies cannot Deal Damage** to one another.
  - **Allies can Heal** one another.

---

## Iteration Five:
- Characters can damage **non-character things (props)**.
- Anything that has **Health** may be a target.
  - These things cannot be **Healed** and do not **Deal Damage**.
  - These things do not belong to Factions; they are **neutral**.
- When reduced to **0 Health**, things are **Destroyed**.
  - **Example:** You may create a **Tree** with 2000 Health.

---
