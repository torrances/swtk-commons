package org.swtk.commons.dict.wiktionary.generated.d.a.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDAI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dailies", "{\"term\":\"dailies\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Items that are produced daily\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Lightly edited versions of the previous days filming; rushes\", \"priority\":2}]}, \"synonyms\":{}}");

	add("dailiness", "{\"term\":\"dailiness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being daily\", \"priority\":1}]}, \"synonyms\":{}}");

	add("daimyo", "{\"term\":\"daimyo\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\", \"late middle chinese\"], \"text\":\"{{borrowing|ja|大名|tr\u003ddaimyō|lang\u003den}}. from Late middle chinese {{m|ltc|大名||excellent one|tr\u003ddàj-mjieng}}, from {{m|ltc|大||great}} + {{m|ltc|名||name}}. Compare Mandarin chinese {{m|cmn|dàmíng}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A lord during the Japanese feudal period\", \"priority\":1}]}, \"synonyms\":{}}");

	add("daintiness", "{\"term\":\"daintiness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|dainty|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The characteristic of being dainty\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A dainty behaviour or gesture\", \"priority\":2}]}, \"synonyms\":{}}");

	add("dainty", "{\"term\":\"dainty\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027deintié\u0027 from Latin {{m|la|dignitātem}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Esteem, honour\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A delicacy\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"my case was deplorable enough, yet I had great cause for thankfulness that I was not driven to any extremities for food, but had rather plenty, even to \u0027\u0027dainties\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A table] furnished plenteously with bread, / And \u0027\u0027dainties\u0027\u0027, remnants of the last regale\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A fancy cookie, pastry, or square served at a social event (usually plural\", \"priority\":5}]}, \"synonyms\":{}}");

	add("daiquiri", "{\"term\":\"daiquiri\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"* Originated 1915-1920; after Daiquirí, a town on the East coast of Cuba.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cocktail of rum, lemon or lime juice and sugar, sometimes with fruit added\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dairy", "{\"term\":\"dairy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\"], \"text\":\"{{PIE root|en|dʰeyǵʰ}}Origin 1250–1300, (Middle english (1100-1500) {{m|enm|daierie}} and other forms), from {{m|en|dey||dairymaid}} + {{m|en|-ery}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A place, often on a farm, where milk is processed and turned into products such as butter and cheese\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A dairy farm\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A shop selling dairy products\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"also \u0027dairy products\u0027 or \u0027dairy produce\u0027) Products produced from milk\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A corner-store, superette or \u0027mini-mart\u0027 of some description\", \"priority\":5}]}, \"synonyms\":{}}");

	add("dairymaid", "{\"term\":\"dairymaid\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|dairy|maid|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woman who works in a dairy\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"But then I had the [massive] flintlock by me for protection. ¶The linen-press and a chest on the top of it formed, however, a very good gun-carriage; and, thus mounted, aim could be taken out of the window, and a \u0027bead\u0027 could be drawn upon Molly, the \u0027\u0027dairymaid\u0027\u0027, kissing the fogger behind the hedge, little dreaming that the deadly tube was levelled at them\", \"priority\":2}]}, \"synonyms\":{}}");

	add("dairyman", "{\"term\":\"dairyman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|dairy|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A man who works in a dairy, or who delivers dairy products\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dairywoman", "{\"term\":\"dairywoman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|dairy|woman|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woman who works in a dairy, or who delivers dairy products\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }