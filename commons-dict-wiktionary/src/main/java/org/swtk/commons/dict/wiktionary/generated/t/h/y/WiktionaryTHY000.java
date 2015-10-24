package org.swtk.commons.dict.wiktionary.generated.t.h.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTHY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("thymine", "{\"term\":\"thymine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A base, C\u0026lt;sub\u0026gt;5\u0026lt;/sub\u0026gt;H\u0026lt;sub\u0026gt;6\u0026lt;/sub\u0026gt;N\u0026lt;sub\u0026gt;2\u0026lt;/sub\u0026gt;O\u0026lt;sub\u0026gt;2\u0026lt;/sub\u0026gt;, obtained by applying sulphuric acid to thymic acid; it pairs with adenine in DNA\", \"priority\":1}]}, \"synonyms\":{}}");

	add("thymopoiesis", "{\"term\":\"thymopoiesis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|thymo|poiesis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The production of thymocytes, which later become T cells\", \"priority\":1}]}, \"synonyms\":{}}");

	add("thyroid", "{\"term\":\"thyroid\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027lang\u003dfr\u0027 coined by {{w|Ambroise Paré}}, after Ancient Greek \u0027lang\u003dgrc|θυρεός\u0027 () + \u0027lang\u003dgrc|εἶδος\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The thyroid gland\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Israel is one of the few countries that widely fluoridates, besides the United States, Canada, Ireland, New Zealand and Australia. Fluoridation, the addition of fluoride to public drinking water supplies to reduce cavities, is the subject of intense controversy, especially outside of the United States. But opposition to the practice, on the grounds that fluoride has adverse effects on the \u0027\u0027thyroid\u0027\u0027, brain and bones, and is an unethical form of mass-medication, appears to be growing\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The thyroid cartilage\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A preparation obtained from the thyroid gland\", \"priority\":4}]}, \"synonyms\":{}}");

	add("thyroidectomy", "{\"term\":\"thyroidectomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|thyroid|ectomy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The surgical removal of the thyroid gland\", \"priority\":1}]}, \"synonyms\":{}}");

	add("thyrotoxicity", "{\"term\":\"thyrotoxicity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|thyro|toxicity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the quality of being thyrotoxic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("thyrotoxicosis", "{\"term\":\"thyrotoxicosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|thyro|toxicosis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The medical condition caused by the state of raised levels of thyroid hormone\", \"priority\":1}]}, \"synonyms\":{}}");

	add("thyrsus", "{\"term\":\"thyrsus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027thyrsus\u0027 from Ancient greek (to 1453) \u0027θύρσος\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A staff topped with a conical ornament, carried by Bacchus or his followers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Longfello\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In my hand I bear / The \u0027\u0027thyrsus\u0027\u0027, tipped with fragrant cones of pine\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Elizabeth Barrett Brownin\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"As good to grow on graves / As twist about a \u0027\u0027thyrsus\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1968\u0027\u0027, Anthony Burgess, \u0027Enderby Outside\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The champagne was done, and she upturned the bottle to hold it like a \u0027\u0027thyrsus\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A species of inflorescence; a dense panicle, as in the lilac and horse-chestnut\", \"priority\":8}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }