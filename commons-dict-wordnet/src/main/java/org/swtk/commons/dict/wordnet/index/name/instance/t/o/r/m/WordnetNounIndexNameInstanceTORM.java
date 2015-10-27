package org.swtk.commons.dict.wordnet.index.name.instance.t.o.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTORM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"torment\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00426281\", \"07434954\", \"07534279\", \"07510691\", \"07511895\", \"14356838\"]}");
	add("{\"term\":\"tormenter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04463547\", \"10735654\"]}");
	add("{\"term\":\"tormentor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04463547\", \"10735654\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }