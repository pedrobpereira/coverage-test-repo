from guardrails import GuardrailsOpenAI
client = GuardrailsOpenAI(config="guardrails_config.json")
resp = client.responses.create(model="gpt-4.1", input="Hello")
