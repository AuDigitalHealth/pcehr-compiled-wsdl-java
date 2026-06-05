# Security

## If you integrate this library

**`pcehr-compiled-wsdl`** provides WSDL resources and generated types. Do **not** embed mutual-TLS private keys, keystore passwords, or production MHR endpoint URLs in **your** application's source control.

## Reporting issues

For **security vulnerabilities in this library** (not routine support):

1. Prefer **GitHub private vulnerability reporting** for this repository if it is enabled (**Security** tab → **Report a vulnerability**).
2. Otherwise use your organisation's channel for **ADHA / AuDigitalHealth** repositories. Do **not** post exploit details, live credentials, or production URLs in a **public issue** before triage.

## This repository

- **Do not commit secrets to git.** That includes passwords, API tokens, private keys, mutual-TLS keystores, and vendor registration material — even in comments, tests, or documentation tracked in this repository.
- **Do not commit** populated **`local.properties`** or a repo-root **`settings.xml`** containing credentials.
- **B2B WSDL and XSD** under **`src/main/resources/wsdl/`** and **`src/main/java/wsdls/`** are part of this open-source artifact. Confirm redistribution terms with ADHA before mirroring to a public fork.
- Generated Java under **`src/main/java/`** is safe to commit; it contains no credentials.
