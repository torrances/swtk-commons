package org.swtk.commons.dict.wordnet.index.name.instance.f.a.u.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAUV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fauve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10102192\"]}");
	add("{\"term\":\"fauvism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08484882\"]}");
	add("{\"term\":\"fauvist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10102192\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }