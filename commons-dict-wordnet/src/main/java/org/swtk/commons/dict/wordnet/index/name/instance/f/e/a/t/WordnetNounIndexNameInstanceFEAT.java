package org.swtk.commons.dict.wordnet.index.name.instance.f.e.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFEAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"feat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00037483\"]}");
	add("{\"term\":\"feather\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00343391\", \"01898672\"]}");
	add("{\"term\":\"featherbed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03330426\"]}");
	add("{\"term\":\"featherbedding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00412566\"]}");
	add("{\"term\":\"featheredge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03330636\"]}");
	add("{\"term\":\"featherfoil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12114761\"]}");
	add("{\"term\":\"featheriness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04946015\"]}");
	add("{\"term\":\"feathering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00343391\"]}");
	add("{\"term\":\"feathertop\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12133712\", \"12149866\"]}");
	add("{\"term\":\"featherweight\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10102456\", \"10102574\", \"10102655\"]}");
	add("{\"term\":\"feature\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03330714\", \"05858739\", \"06279437\", \"06627379\", \"05609513\", \"05858316\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }