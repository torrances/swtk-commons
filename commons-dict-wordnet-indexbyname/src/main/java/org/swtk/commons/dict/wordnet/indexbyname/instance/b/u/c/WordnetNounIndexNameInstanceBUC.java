package org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"buccaneer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10455134\"]}");
	add("{\"term\":\"buccaneering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00785181\"]}");
	add("{\"term\":\"buccinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01949916\"]}");
	add("{\"term\":\"bucconidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01845021\"]}");
	add("{\"term\":\"buccula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05607524\"]}");
	add("{\"term\":\"bucephala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01852676\"]}");
	add("{\"term\":\"buceros\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01831929\"]}");
	add("{\"term\":\"bucerotidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01831784\"]}");
	add("{\"term\":\"buchanan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10889518\"]}");
	add("{\"term\":\"bucharest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08832326\"]}");
	add("{\"term\":\"bucharesti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08832326\"]}");
	add("{\"term\":\"buchenwald\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02912868\"]}");
	add("{\"term\":\"buchloe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12133005\"]}");
	add("{\"term\":\"buchner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10889659\"]}");
	add("{\"term\":\"buck\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01890905\", \"04147696\", \"10889822\", \"13417070\", \"04531437\"]}");
	add("{\"term\":\"buckaroo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09992739\"]}");
	add("{\"term\":\"buckbean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12505289\"]}");
	add("{\"term\":\"buckboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02913031\"]}");
	add("{\"term\":\"buckeroo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09992739\"]}");
	add("{\"term\":\"bucket\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13787889\", \"02913195\"]}");
	add("{\"term\":\"bucketful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13787889\"]}");
	add("{\"term\":\"buckeye\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09764372\", \"12789129\", \"12789442\"]}");
	add("{\"term\":\"buckle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13908393\", \"02913678\"]}");
	add("{\"term\":\"buckler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04199741\"]}");
	add("{\"term\":\"buckleya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12756577\"]}");
	add("{\"term\":\"buckminsterfullerene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14646528\"]}");
	add("{\"term\":\"buckram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02913867\"]}");
	add("{\"term\":\"bucksaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02914026\"]}");
	add("{\"term\":\"buckshot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02847015\"]}");
	add("{\"term\":\"buckskin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14784734\", \"02383656\"]}");
	add("{\"term\":\"buckskins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02914189\"]}");
	add("{\"term\":\"buckthorn\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12619946\", \"12793513\", \"13161918\"]}");
	add("{\"term\":\"bucktooth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05313889\"]}");
	add("{\"term\":\"buckwheat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07819286\", \"12622255\"]}");
	add("{\"term\":\"buckyball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14646528\"]}");
	add("{\"term\":\"bucolic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06391062\", \"10430413\"]}");
	add("{\"term\":\"bucuresti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08832326\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }