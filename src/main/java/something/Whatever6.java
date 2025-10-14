package something;
public abstract class Whatever6 {
        @SuppressWarnings({})
        private void foo() {
            int sum = 10
                    + 20

                    + 50;
        }
    }



from openai import OpenAI
        client = OpenAI()
resp = client.responses.create(model="gpt-4.1", input="Hello")

openai.ChatCompletion.create(model="gpt-4.1", input="Hello")

from guardrails import GuardrailsOpenAI
        client = GuardrailsOpenAI(config="guardrails_config.json")
resp = client.responses.create(model="gpt-4.1", input="Hello")
