package org.swtk.commons.dict.wordnet.index.name.instance.h.o.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHORR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"horridness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04789380\"]}");
	add("{\"term\":\"horripilation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00868284\"]}");
	add("{\"term\":\"horror\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07519226\", \"03543047\", \"07535650\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }