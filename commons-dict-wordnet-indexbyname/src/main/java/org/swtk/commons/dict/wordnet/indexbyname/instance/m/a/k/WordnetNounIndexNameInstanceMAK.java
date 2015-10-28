package org.swtk.commons.dict.wordnet.indexbyname.instance.m.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08050207\"]}");
	add("{\"term\":\"makaira\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02633556\"]}");
	add("{\"term\":\"makalu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09369181\"]}");
	add("{\"term\":\"makataimeshekiakiak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10871916\"]}");
	add("{\"term\":\"make\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00341289\", \"05853667\"]}");
	add("{\"term\":\"makedonija\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08935145\"]}");
	add("{\"term\":\"makeover\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00270518\", \"00661813\"]}");
	add("{\"term\":\"maker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08077282\", \"09559474\", \"10303761\"]}");
	add("{\"term\":\"makeready\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01146470\"]}");
	add("{\"term\":\"makeshift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00179400\"]}");
	add("{\"term\":\"makeup\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04940721\", \"07337369\", \"03719774\"]}");
	add("{\"term\":\"makeweight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03720149\", \"03720260\"]}");
	add("{\"term\":\"makin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01299188\"]}");
	add("{\"term\":\"making\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03720438\", \"04724415\", \"00925809\"]}");
	add("{\"term\":\"mako\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01486738\"]}");
	add("{\"term\":\"makomako\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12214182\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }