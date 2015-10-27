package org.swtk.commons.dict.wordnet.index.name.instance.m.i.n.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMINN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"minneapolis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09125491\"]}");
	add("{\"term\":\"minnesota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09124616\"]}");
	add("{\"term\":\"minnesotan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09763123\"]}");
	add("{\"term\":\"minnewit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11201428\"]}");
	add("{\"term\":\"minniebush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12262640\"]}");
	add("{\"term\":\"minnow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01445613\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }