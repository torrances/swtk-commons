package org.swtk.commons.dict.wordnet.index.name.instance.a.m.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amoeba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01395021\"]}");
	add("{\"term\":\"amoebiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14198647\"]}");
	add("{\"term\":\"amoebida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394210\"]}");
	add("{\"term\":\"amoebina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394210\"]}");
	add("{\"term\":\"amoebiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14198647\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }