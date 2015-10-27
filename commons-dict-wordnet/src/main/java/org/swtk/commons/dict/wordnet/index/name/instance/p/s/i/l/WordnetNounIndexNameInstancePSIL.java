package org.swtk.commons.dict.wordnet.index.name.instance.p.s.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePSIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"psilocin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04023413\"]}");
	add("{\"term\":\"psilocybin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04023413\"]}");
	add("{\"term\":\"psilomelane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14716503\"]}");
	add("{\"term\":\"psilophytaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13238522\"]}");
	add("{\"term\":\"psilophytales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13238111\"]}");
	add("{\"term\":\"psilophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13238392\"]}");
	add("{\"term\":\"psilophyton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13238891\"]}");
	add("{\"term\":\"psilopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13236834\"]}");
	add("{\"term\":\"psilosis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13564058\", \"14424383\"]}");
	add("{\"term\":\"psilotaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13237373\"]}");
	add("{\"term\":\"psilotales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13237136\"]}");
	add("{\"term\":\"psilotatae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13236834\"]}");
	add("{\"term\":\"psilotum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13237571\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }