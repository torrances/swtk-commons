package org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cab\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02934150\", \"02934397\", \"02934532\"]}");
	add("{\"term\":\"cabal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05917476\", \"08258719\"]}");
	add("{\"term\":\"cabala\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05962967\", \"06686515\"]}");
	add("{\"term\":\"cabalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01215896\", \"05963233\"]}");
	add("{\"term\":\"cabalist\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09904868\", \"09904986\", \"09905128\"]}");
	add("{\"term\":\"cabana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02934678\"]}");
	add("{\"term\":\"cabaret\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00521728\", \"02934801\"]}");
	add("{\"term\":\"cabasset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03791254\"]}");
	add("{\"term\":\"cabassous\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02458059\"]}");
	add("{\"term\":\"cabbage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11896160\", \"13406389\", \"07729640\"]}");
	add("{\"term\":\"cabbageworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02313237\"]}");
	add("{\"term\":\"cabbala\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05962967\", \"06686515\"]}");
	add("{\"term\":\"cabbalah\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05962967\", \"06686515\"]}");
	add("{\"term\":\"cabby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10713142\"]}");
	add("{\"term\":\"cabdriver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10713142\"]}");
	add("{\"term\":\"cabell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10897208\"]}");
	add("{\"term\":\"caber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02935220\"]}");
	add("{\"term\":\"cabernet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07911685\"]}");
	add("{\"term\":\"cabg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00677051\"]}");
	add("{\"term\":\"cabin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02935403\", \"02935784\", \"02935611\"]}");
	add("{\"term\":\"cabinet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02936724\", \"02936846\", \"08398551\", \"02936496\"]}");
	add("{\"term\":\"cabinetmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09905318\"]}");
	add("{\"term\":\"cabinetmaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00618841\"]}");
	add("{\"term\":\"cabinetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00608657\"]}");
	add("{\"term\":\"cabinetwork\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00608657\", \"02937033\"]}");
	add("{\"term\":\"cable\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02937374\", \"06288991\", \"13674504\", \"02937226\", \"02937552\", \"06285748\"]}");
	add("{\"term\":\"cablegram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06285748\"]}");
	add("{\"term\":\"cabman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10713142\"]}");
	add("{\"term\":\"cabochon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14724207\"]}");
	add("{\"term\":\"cabomba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11738565\"]}");
	add("{\"term\":\"cabombaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11738289\"]}");
	add("{\"term\":\"caboodle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07971317\"]}");
	add("{\"term\":\"caboose\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02935907\", \"03417130\"]}");
	add("{\"term\":\"cabot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10897336\", \"10897593\"]}");
	add("{\"term\":\"cabotage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00316133\", \"05183298\"]}");
	add("{\"term\":\"cabriolet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02934397\"]}");
	add("{\"term\":\"cabstand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08535244\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }