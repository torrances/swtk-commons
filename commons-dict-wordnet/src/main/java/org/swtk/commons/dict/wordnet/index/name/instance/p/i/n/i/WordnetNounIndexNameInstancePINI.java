package org.swtk.commons.dict.wordnet.index.name.instance.p.i.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePINI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pinicola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01543610\"]}");
	add("{\"term\":\"pining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07502203\"]}");
	add("{\"term\":\"pinion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02155098\", \"02471495\", \"03949391\"]}");
	add("{\"term\":\"pinite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14715099\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }