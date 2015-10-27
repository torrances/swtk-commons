package org.swtk.commons.dict.wordnet.index.name.instance.l.a.r.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLARD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07688166\"]}");
	add("{\"term\":\"larder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03891232\", \"07588181\"]}");
	add("{\"term\":\"lardizabala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11723674\"]}");
	add("{\"term\":\"lardizabalaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11723468\"]}");
	add("{\"term\":\"lardner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11137734\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }