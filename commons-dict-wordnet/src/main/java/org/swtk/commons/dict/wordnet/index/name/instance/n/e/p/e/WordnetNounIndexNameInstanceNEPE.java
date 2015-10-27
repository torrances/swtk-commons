package org.swtk.commons.dict.wordnet.index.name.instance.n.e.p.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEPE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nepenthaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12802419\"]}");
	add("{\"term\":\"nepenthes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12802574\"]}");
	add("{\"term\":\"nepeta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12880633\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }