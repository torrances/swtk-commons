package org.swtk.commons.dict.wiktionary.generated.g.i.f;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGIF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gift", "{\"term\":\"gift\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"old norse\"], \"text\":\"From Middle english (1100-1500) {{m|enm|gift}} (also {{m|enm|ȝift}}, {{m|enm|ȝeft}}), partly from Old english (ca. 450-1100) {{m|ang|ġyft}}, {{m|ang|ġieft}}, {{m|ang|ġift||giving, consideration, dowry, wedding}} and Old norse \u0027gipt\u0027 (gift, present, wedding) both from Proto-germanic {{m|gem-pro|*giftiz||gift}}. Cognate with Dutch {{m|nl|gift||gift}}, German {{m|de|Gift||dose, poison, toxin}}, Icelandic {{m|is|gift||gift}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something given to another voluntarily, without charge\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A talent or natural ability\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"“[…] it is not fair of you to bring against mankind double weapons\u0026amp;thinsp;! Dangerous enough you are as woman alone, without bringing to your aid those \u0027\u0027gifts\u0027\u0027 of mind suited to problems which men have been accustomed to arrogate to themselves\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Something gained incidentally, without effort\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The act, right, or power of giving or bestowing\", \"priority\":5}]}, \"synonyms\":{}}");

	add("giftee", "{\"term\":\"giftee\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|gift|ee|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who receives a gift\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }