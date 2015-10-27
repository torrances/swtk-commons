package org.swtk.commons.dict.wordnet.index.name.instance.f.o.x.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFOXH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"foxhole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03394921\"]}");
	add("{\"term\":\"foxhound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02092207\"]}");
	add("{\"term\":\"foxhunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00454502\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }