package org.swtk.commons.dict.wordnet.index.name.instance.m.a.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMACH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11167523\"]}");
	add("{\"term\":\"machaeranthera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12013476\"]}");
	add("{\"term\":\"machete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03704925\"]}");
	add("{\"term\":\"machiavelli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11167719\"]}");
	add("{\"term\":\"machiavellian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10298265\"]}");
	add("{\"term\":\"machiavellianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06223917\"]}");
	add("{\"term\":\"machicolation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03705088\"]}");
	add("{\"term\":\"machilid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02273874\"]}");
	add("{\"term\":\"machilidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02273739\"]}");
	add("{\"term\":\"machination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05917114\"]}");
	add("{\"term\":\"machinator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09978371\"]}");
	add("{\"term\":\"machine\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02961779\", \"08281504\", \"03706297\", \"08281680\", \"10298363\", \"03705309\"]}");
	add("{\"term\":\"machinery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08451039\", \"03706974\"]}");
	add("{\"term\":\"machinist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10298715\"]}");
	add("{\"term\":\"machismo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04674537\"]}");
	add("{\"term\":\"machmeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03708121\"]}");
	add("{\"term\":\"macho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10298916\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }