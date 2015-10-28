package org.swtk.commons.dict.wordnet.indexbyname.instance.h.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hacek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06836139\"]}");
	add("{\"term\":\"hachiman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09557954\"]}");
	add("{\"term\":\"hachure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04689154\"]}");
	add("{\"term\":\"hacienda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03479475\", \"13273294\"]}");
	add("{\"term\":\"hack\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"02381621\", \"02384784\", \"02384856\", \"02934150\", \"03479590\", \"10174309\", \"10298502\", \"10174170\"]}");
	add("{\"term\":\"hackamore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03485802\"]}");
	add("{\"term\":\"hackberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07762014\", \"12429736\"]}");
	add("{\"term\":\"hackbut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02745075\"]}");
	add("{\"term\":\"hackee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02362567\"]}");
	add("{\"term\":\"hackelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12840713\"]}");
	add("{\"term\":\"hacker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10174170\", \"10174440\", \"10174709\"]}");
	add("{\"term\":\"hackle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01901100\"]}");
	add("{\"term\":\"hackles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07533239\"]}");
	add("{\"term\":\"hackmatack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12752595\"]}");
	add("{\"term\":\"hackney\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02388876\", \"03479758\"]}");
	add("{\"term\":\"hacksaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03479902\"]}");
	add("{\"term\":\"hackwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00624099\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }