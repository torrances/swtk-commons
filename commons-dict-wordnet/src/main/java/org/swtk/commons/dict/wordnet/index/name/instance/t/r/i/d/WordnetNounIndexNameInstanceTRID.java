package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tridacna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01961974\"]}");
	add("{\"term\":\"tridacnidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01961828\"]}");
	add("{\"term\":\"trident\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04490231\"]}");
	add("{\"term\":\"tridymite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104124\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }