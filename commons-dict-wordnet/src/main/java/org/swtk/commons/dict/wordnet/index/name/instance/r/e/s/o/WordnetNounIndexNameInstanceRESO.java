package org.swtk.commons.dict.wordnet.index.name.instance.r.e.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRESO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"resoluteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04868717\"]}");
	add("{\"term\":\"resolution\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"00181077\", \"06756201\", \"07041708\", \"07434817\", \"11526370\", \"05790881\", \"05797094\", \"00154629\", \"04868717\", \"11526187\", \"06523865\"]}");
	add("{\"term\":\"resolve\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06523865\", \"04868717\"]}");
	add("{\"term\":\"resolvent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15071880\"]}");
	add("{\"term\":\"resolving\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05790881\"]}");
	add("{\"term\":\"resonance\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04995507\", \"13833952\", \"04996893\", \"11498321\", \"11498699\"]}");
	add("{\"term\":\"resonator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04087250\", \"04087349\", \"04087566\"]}");
	add("{\"term\":\"resorcinol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15029282\"]}");
	add("{\"term\":\"resorcinolphthalein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15012254\"]}");
	add("{\"term\":\"resorption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13571707\"]}");
	add("{\"term\":\"resort\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01211087\", \"05162506\", \"08599031\", \"08658106\"]}");
	add("{\"term\":\"resource\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05641705\", \"05161923\", \"13352793\"]}");
	add("{\"term\":\"resourcefulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05641705\", \"05162859\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }