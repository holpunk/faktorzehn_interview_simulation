# Faktor-IPS Tutorial - Hausratversicherung

Tutorial project for modeling household contents insurance with [Faktor-IPS](https://www.faktorzehn.com/en/faktor-ips/).

## Domain Model
The project models a **Household Contents Insurance** (*Hausratversicherung*) with the following key components:

- **HausratVertrag**: The policy (Contract) containing:
  - `zahlweise`: Payment frequency (Monthly, Quarterly, etc.).
  - `plz`: Postal code.
  - `tarifzone`: Calculated tariff zone.
  - `wohnflaeche`: Living area in $m^2$.
  - `versSumme`: Sum insured (calculated or manual).
- **HausratProdukt**: Product configuration for the contract.
- **HausratGrunddeckung**: Basic coverage details.

## Modules

- **[Hausratmodell](./Hausratmodell)**: Core model definition and generated logic.
- **[Hausratprodukte](./Hausratprodukte)**: Concrete product data (e.g., *HR-Kompakt*, *HR-Optimal*).

## Usage

### Prerequisites
- Java 21, Maven 3.9+

### Build & Test
Since there is no root POM, modules must be built in order:
```bash
# 1. Build the model
cd Hausratmodell && mvn clean install

# 2. Build the products
cd ../Hausratprodukte && mvn clean install

# 3. Run tests
mvn test
```

## Tech Stack
- Faktor-IPS 26.1, Java 21, Maven, JUnit 5

## License
AGPL-3.0 (see [LICENSE.txt](./Hausratmodell/LICENSE.txt))
