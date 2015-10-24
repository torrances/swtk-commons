package org.swtk.commons.dict.wiktionary.generated.v.e.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVEG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("végé", "{\"term\":\"végé\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"apocope|Apocope of \u0027végétarien\u0027 probably influenced by English \u0027veggie\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"veggie\", \"priority\":1}]}, \"synonyms\":{}}");

	add("veganaise", "{\"term\":\"veganaise\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|vegan|mayonnaise|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"vegan imitation mayonnais\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Sandy Colledge, \u0027God\u0027s Prescription for Cancer\u0027, [http://books.google.com/books?id\u003dmORbxQjCF5gC\u0026amp;pg\u003dPA71\u0026amp;dq\u003d%22veganaise%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dwuPgT9aCL6Xa2wXJuZDHCw\u0026amp;ved\u003d0CDcQ6AEwADgU page 71\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Then I may add rosemary, dill, Italian dressing, and \u0027\u0027veganaise\u0027\u0027 to different bottles and even a can of tomato paste when I want something more along that line\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Fayth Silveus, \u0027Fayth\u0027s Christian Cookbook\u0027, [http://books.google.com/books?id\u003dwe9b8aSnv8wC\u0026amp;pg\u003dPA30\u0026amp;dq\u003d%22veganaise%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dHuPgT_TiNui22gXCvNm2Cw\u0026amp;ved\u003d0CFIQ6AEwBA page 30\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Cauliflower Salad Ingredients 1 head of Cauliflower 3 cups of shredded romaine lettuce 1 cup \u0027\u0027veganaise\u0027\u0027 ½ cup unsweetened soy milk 1 tsp stevia glycerite 1 tsp Braggs Liquid Aminos 2 tbsp Vegan Bacon Bits Clean and cut Cauliflower\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Brendan Brazier, \u0027Thrive Foods: 200 Plant-Based Recipes for Peak Health\u0027, [http://books.google.com/books?id\u003d3fs20ilb9qwC\u0026amp;pg\u003dPA173\u0026amp;dq\u003d%22veganaise%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dHuPgT_TiNui22gXCvNm2Cw\u0026amp;ved\u003d0CG4Q6AEwCQ page 173\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1 ripe avocado 1 clove garlic 2 tbsp olive oil 2 tsp salt 2 tsp pepper 1 tsp organic palm sugar ¼ cup vegan mayo (preferably \u0027\u0027veganaise\u0027\u0027) ½ tsp Dijon mustard\", \"priority\":7}]}, \"synonyms\":{}}");

	add("vegetable", "{\"term\":\"vegetable\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027vegetable\u0027 from Latin \u0027vegetabilis\u0027 (able to live and grow) derived from Latin \u0027vegetare\u0027 (to enliven)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any plant\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A plant raised for some edible part of it, such as the leaves, roots, fruit or flowers, but excluding any plant considered to be a fruit, grain, or spice in the culinary sense\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The edible part of such a plant\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A person whose brain (or, infrequently, body) has been damaged so that they cannot interact with the surrounding environment; a brain-dead person\", \"priority\":4}]}, \"synonyms\":{}}");

	add("vegetarianism", "{\"term\":\"vegetarianism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vegetarian|ism|lang\u003den}}First English attestation dates to 1848 (Merriam-Webster).\u0026lt;!----source http://www.merriam-webster.com/dictionary/vegetarianism ----\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The practice of following a vegetarian diet\", \"priority\":1}]}, \"synonyms\":{}}");

	add("veggie", "{\"term\":\"veggie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From pronounced stem of \u0027\u0027 or \u0027\u0027 {{suffix||ie|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A vegetable\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A vegetarian\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I\u0027m a \u0027\u0027veggie\u0027\u0027 at heart - the idea of animals dying to make my food, I find totally abhorrent\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }