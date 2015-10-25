package org.swtk.commons.dict.wiktionary.generated.t.u.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTUE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tuesday", "{\"term\":\"tuesday\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"Danish\", \"German\", \"English\", \"middle english (1100-1500)\", \"West Frisian\", \"ancient greek (to 1453)\", \"Latin\", \"scots\", \"saterfriesisch\", \"Swedish\"], \"text\":\"From Middle english (1100-1500) \u0027tewesday\u0027 from Old english (ca. 450-1100) {{m|ang|Tīwesdæġ||Tuesday}}, from Proto-germanic {{m|gem-pro|*Tīwas dagaz||Tuesday|lit\u003dTiw\u0027s Day}}, from {{m|gem-pro|*Tīwaz||Tyr, god of war}} + {{m|gem-pro|*dagaz||day}}. This was a Germanic rendering of Latin \u0027dies martis\u0027 in {{w|interpretatio germanica}}, itself a translation of Ancient greek (to 1453) {{m|grc|Ἄρεως ἡμέρα}} ({{w|interpretatio romana}}). Cognate with Scots \u0027tysday\u0027 (tuesday) Saterfriesisch {{m|stq|Täisdai||Tuesday}}, West frisian \u0027tiisdei\u0027 (tuesday) German dialectal \u0027ziestag\u0027 (tuesday) Danish \u0027tirsdag\u0027 (tuesday) Swedish \u0027tisdag\u0027 (tuesday) More at \u0027tyr\u0027 \u0027day\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The third day of the week in many religious traditions, and the second day of the week in systems that use the ISO 8601 norm; it follows Monday and precedes Wednesday.\u0026lt;!--this is probably just an attributive use of the noun\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An appointment, person, or feeling associated with this day of the week.--\u0026gt\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }