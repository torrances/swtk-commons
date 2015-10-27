package org.swtk.commons.dict.wordnet.index.name.instance.d.e.f.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEFO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"defoe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10947021\"]}");
	add("{\"term\":\"defoliant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14853097\"]}");
	add("{\"term\":\"defoliation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00280518\", \"13481237\"]}");
	add("{\"term\":\"defoliator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02163990\"]}");
	add("{\"term\":\"deforestation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01264934\", \"14542699\"]}");
	add("{\"term\":\"deformation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00405547\", \"07372660\", \"07448573\"]}");
	add("{\"term\":\"deformity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04698526\", \"14236994\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }