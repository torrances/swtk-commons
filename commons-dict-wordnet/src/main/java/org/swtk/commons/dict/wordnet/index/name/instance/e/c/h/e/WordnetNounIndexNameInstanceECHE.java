package org.swtk.commons.dict.wordnet.index.name.instance.e.c.h.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceECHE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"echelon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03268385\", \"08289273\", \"13969830\"]}");
	add("{\"term\":\"echeneididae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02577282\"]}");
	add("{\"term\":\"echeneis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02577799\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }