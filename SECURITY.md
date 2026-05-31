# Security

## If you integrate this library

**`pcehr-compiled-wsdl`** provides WSDL resources and generated types. Do **not** embed mutual-TLS private keys, keystore passwords, or production MHR endpoint URLs in **your** application's source control.

## Reporting issues

For **security vulnerabilities in this library** (not routine support):

1. Prefer **GitHub private vulnerability reporting** for this repository if it is enabled (**Security** tab → **Report a vulnerability**).
2. Otherwise use your organisation's channel for **ADHA / AuDigitalHealth** repositories. Do **not** post exploit details, live credentials, or production URLs in a **public issue** before triage.

## This repository

- **Do not commit secrets to git.** That includes passwords, API tokens, private keys, mutual-TLS keystores, and vendor registration material.
- **Licensed PCEHR XSD (`src/main/resources/schema/...`)** must **not** be pushed to a public fork. **`.gitignore`** excludes **`/src/main/resources/schema/*`** except **`src/main/resources/schema/.gitkeep`**; verify with **`git status`** before every push. Obtain schemas from the My Health Record / PCEHR B2B integration pack (or **mhr-b2b-client-java** `wsdls/src/main/resources/schema/`) for local regeneration only.
- **JAXB binding fragments** under **`src/main/resources/binding/`** are safe to commit — they are build customisation, not vendor schema content.
- **Do not commit** populated **`settings.xml`** (see **`settings.xml.example`**). Use **`MVN_SETTINGS`** or merge release credentials into **`~/.m2/settings.xml`** locally.
- **B2B WSDL files** under **`src/main/resources/wsdl/`** are published as part of this open-source artifact. Confirm redistribution terms with ADHA before mirroring.
- **Do not commit** populated **`local.properties`**.
