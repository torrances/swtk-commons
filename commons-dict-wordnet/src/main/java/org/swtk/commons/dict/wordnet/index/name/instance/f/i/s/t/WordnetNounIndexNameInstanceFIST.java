package org.swtk.commons.dict.wordnet.index.name.instance.f.i.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFIST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05572697\"]}");
	add("{\"term\":\"fistfight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01176316\"]}");
	add("{\"term\":\"fistful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13789490\"]}");
	add("{\"term\":\"fisticuffs\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00446787\", \"01176316\"]}");
	add("{\"term\":\"fistmele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13675233\"]}");
	add("{\"term\":\"fistula\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05555665\", \"14286942\"]}");
	add("{\"term\":\"fistularia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01457034\"]}");
	add("{\"term\":\"fistulariidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01456901\"]}");
	add("{\"term\":\"fistulina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13074210\"]}");
	add("{\"term\":\"fistulinaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13073947\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }