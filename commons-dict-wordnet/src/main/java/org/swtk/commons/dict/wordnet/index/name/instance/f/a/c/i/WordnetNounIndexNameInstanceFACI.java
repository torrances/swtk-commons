package org.swtk.commons.dict.wordnet.index.name.instance.f.a.c.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFACI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"facia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05590163\"]}");
	add("{\"term\":\"facial\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00667024\", \"05486966\"]}");
	add("{\"term\":\"facilitation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01210781\", \"11474459\", \"14599076\"]}");
	add("{\"term\":\"facilitator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10095481\"]}");
	add("{\"term\":\"facility\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00579586\", \"00586443\", \"04716072\", \"05650020\", \"03319968\"]}");
	add("{\"term\":\"facing\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00829040\", \"03320589\", \"03320935\", \"03320750\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }