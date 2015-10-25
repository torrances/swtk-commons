package org.swtk.commons.dict.wiktionary.generated.t.u.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTUB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tuballoy", "{\"term\":\"tuballoy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Natural uranium in the refined condition\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tuberculosis", "{\"term\":\"tuberculosis\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027tuberculum\u0027 (diminutive of \u0027tuber\u0027 (lump) {{suffix||osis|t2\u003ddiseased condition|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An infectious disease of humans and animals caused by a species of mycobacterium, usually , mainly infecting the lungs where it causes tubercles characterized by the expectoration of mucus and sputum, fever, weight loss, and chest pain, and transmitted through inhalation or ingestion of bacteria\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tuberose", "{\"term\":\"tuberose\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Mexican tuberous plant () that has white flowers and grass-like leaves\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tubful", "{\"term\":\"tubful\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tub|ful|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an amount that would fill a tub\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tubside", "{\"term\":\"tubside\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tub|side|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The side of a bathtub\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1973\u0027\u0027, G Y Dryansky, \u0027Other people\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The ochre water laps against the marble \u0027\u0027tubsides\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1974\u0027\u0027, Parker Tyler, \u0027A pictorial history of sex in films\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Tubside\u0027\u0027 rituals: Gloria Swanson, here in a scene from \u0027Male and Female\u0027 (1919), inhabited only luxury bathrooms\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Richard Monaco, \u0027Parsival or a Knight\u0027s Tale\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Her willowy friend, mysteriously joined to the young man, no longer a part of the general situation, had sagged against the warm \u0027\u0027tubside\", \"priority\":7}]}, \"synonyms\":{}}");

	add("tubthumping", "{\"term\":\"tubthumping\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tub|thumping|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Aggressive political or commercial promotion\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1914\u0027\u0027, Harper, Charles G., \u0027The Kentish Coast\u0027, page 34\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"…] the general public, who imagine — poor fools — that all the fury and \u0027\u0027tubthumping\u0027\u0027 at Westminster is honest emotion, […\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1939\u0027\u0027, \u0027Railway Age\u0027, vol. 107, Oct.-Dec\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"But there is usually more to Automobile Week than good-natured \u0027\u0027tubthumping\u0027\u0027 for the new passenger car models\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }