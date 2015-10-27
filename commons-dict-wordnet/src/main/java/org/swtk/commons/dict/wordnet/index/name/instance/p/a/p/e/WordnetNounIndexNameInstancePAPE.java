package org.swtk.commons.dict.wordnet.index.name.instance.p.a.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"papeete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09012573\"]}");
	add("{\"term\":\"paper\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"03827711\", \"08079806\", \"06280609\", \"06266190\", \"06277798\", \"06421395\", \"14998823\"]}");
	add("{\"term\":\"paperback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03892129\"]}");
	add("{\"term\":\"paperboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14825316\"]}");
	add("{\"term\":\"paperboy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10416607\"]}");
	add("{\"term\":\"paperclip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03892459\"]}");
	add("{\"term\":\"paperer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10416700\"]}");
	add("{\"term\":\"paperhanger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10416700\", \"10416841\"]}");
	add("{\"term\":\"paperhanging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00719825\"]}");
	add("{\"term\":\"papering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00719825\"]}");
	add("{\"term\":\"paperknife\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03663511\"]}");
	add("{\"term\":\"papermaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00610691\"]}");
	add("{\"term\":\"papers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06481744\"]}");
	add("{\"term\":\"paperweight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03893494\"]}");
	add("{\"term\":\"paperwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00583108\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }