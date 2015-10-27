package org.swtk.commons.dict.wordnet.index.name.instance.b.a.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBARR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"barrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02797802\"]}");
	add("{\"term\":\"barracking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01070557\"]}");
	add("{\"term\":\"barracouta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02516672\"]}");
	add("{\"term\":\"barracuda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02605947\"]}");
	add("{\"term\":\"barrage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00989949\", \"07097633\"]}");
	add("{\"term\":\"barramundi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02563177\"]}");
	add("{\"term\":\"barranquilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08750640\"]}");
	add("{\"term\":\"barrater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09860259\"]}");
	add("{\"term\":\"barrator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09860259\"]}");
	add("{\"term\":\"barratry\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00766696\", \"00770890\", \"00777963\", \"01116282\"]}");
	add("{\"term\":\"barrel\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"13641201\", \"13786904\", \"13923904\", \"02798192\", \"02798551\"]}");
	add("{\"term\":\"barrelfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02637784\"]}");
	add("{\"term\":\"barrelful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13786904\"]}");
	add("{\"term\":\"barrelhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02798693\"]}");
	add("{\"term\":\"barrels\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13796511\"]}");
	add("{\"term\":\"barren\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08521615\"]}");
	add("{\"term\":\"barrenness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05155433\", \"14068829\"]}");
	add("{\"term\":\"barrenwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11719540\"]}");
	add("{\"term\":\"barrette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02799477\"]}");
	add("{\"term\":\"barretter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02783144\"]}");
	add("{\"term\":\"barricade\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02799571\", \"04103942\"]}");
	add("{\"term\":\"barrie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10854618\"]}");
	add("{\"term\":\"barrier\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09237488\", \"05698721\", \"02799782\"]}");
	add("{\"term\":\"barring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00208471\"]}");
	add("{\"term\":\"barrio\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08693991\", \"08694087\"]}");
	add("{\"term\":\"barrister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09860351\"]}");
	add("{\"term\":\"barroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02800154\"]}");
	add("{\"term\":\"barrow\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02800454\", \"02925676\", \"13787037\"]}");
	add("{\"term\":\"barrowful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13787037\"]}");
	add("{\"term\":\"barrymore\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10854814\", \"10855046\", \"10855305\", \"10855462\", \"10855625\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }