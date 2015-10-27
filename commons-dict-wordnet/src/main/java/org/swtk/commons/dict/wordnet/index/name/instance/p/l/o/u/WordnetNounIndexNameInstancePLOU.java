package org.swtk.commons.dict.wordnet.index.name.instance.p.l.o.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLOU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"plough\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03973894\", \"09242765\"]}");
	add("{\"term\":\"ploughboy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10462279\"]}");
	add("{\"term\":\"ploughing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00920458\"]}");
	add("{\"term\":\"ploughland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09283813\"]}");
	add("{\"term\":\"ploughman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10462389\"]}");
	add("{\"term\":\"ploughshare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03974120\"]}");
	add("{\"term\":\"ploughwright\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10462497\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }