package org.swtk.commons.dict.wordnet.index.name.instance.s.e.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"seam\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08676707\", \"13928798\", \"04167433\"]}");
	add("{\"term\":\"seaman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11310643\", \"10314263\"]}");
	add("{\"term\":\"seamanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05647677\"]}");
	add("{\"term\":\"seamount\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09450630\"]}");
	add("{\"term\":\"seamster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10709060\"]}");
	add("{\"term\":\"seamstress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10053137\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }