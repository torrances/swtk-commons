package org.swtk.commons.dict.wiktionary.generated.b.a.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBAK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bakehouse", "{\"term\":\"bakehouse\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"low german\", \"scots\"], \"text\":\"From Middle english (1100-1500) \u0027bakhous\u0027 \u0027bachous\u0027 from Old english (ca. 450-1100) {{m|ang|bæchūs||bakery, bakehouse}}, equivalent to {{compound|bake|house|lang\u003den}}. Cognate with Scots \u0027bake-hous\u0027 (bakehouse, bakery) Low german \u0027backhus\u0027 (bakehouse)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A building or an apartment used for the preparing and baking of bread and other baked goods\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A building principally containing ovens\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Bakery\", \"priority\":3}]}, \"synonyms\":{}}");

	add("bakery", "{\"term\":\"bakery\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|bake|ery|gloss2\u003dplace of|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A shop in which bread (and often other baked goods such as cakes) is baked and/or sold\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The trade of a baker\", \"priority\":2}]}, \"synonyms\":{}}");

	add("bakeshop", "{\"term\":\"bakeshop\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A shop where baked goods are made and sold\", \"priority\":1}]}, \"synonyms\":{}}");

	add("baksheesh", "{\"term\":\"baksheesh\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Persian\", \"Turkish\"], \"text\":\"Turkish \u0027bahşiş\u0027 from Persian \u0027sc\u003dfa-arab|بخشیش|tr\u003dbakhšīš\u0027 (present; an honorary or pecuniary gratuity; drink-money) or \u0027sc\u003dfa-arab\u0027 from \u0027sc\u003dfa-arab|بخشیدن|tr\u003dbakhšīdan\u0027 (to give, grant, bestow)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"In the Middle East, southwest Asia and Eastern Europe, a bribe or tip\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1966\u0027\u0027, Leo Deuel, \u0027Testaments of Time: the Search for Lost Manuscripts and Records\u0027, New York, p. 367\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the complex Oriental etiquette which under the name of \u0026quot;\u0027\u0027baksheesh\u0027\u0027\u0026quot; calls for lavish remuneration and bribes, rudely demanded but ever so graciously accepted by the natives in return for little or no services rendered\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1985\u0027\u0027, Eugene R. Laczniak \u0027et al.\u0027, \u0027Marketing Ethics: Guidelines for Managers\u0027, ISBN 9780669108330, p. 86\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Baksheesh\u0027\u0027 (lubrication payment) is often the accepted manner of doing business in the Middle and Far East. However, one must be careful not to confuse ethics with the law\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }