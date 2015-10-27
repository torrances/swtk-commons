package org.swtk.commons.dict.wordnet.index.name.instance.m.o.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"momordica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12187799\"]}");
	add("{\"term\":\"momos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09589043\"]}");
	add("{\"term\":\"momot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01833556\"]}");
	add("{\"term\":\"momotidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01833264\"]}");
	add("{\"term\":\"momotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01833440\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }