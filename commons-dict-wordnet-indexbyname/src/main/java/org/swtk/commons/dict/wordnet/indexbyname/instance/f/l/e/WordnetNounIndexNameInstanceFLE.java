package org.swtk.commons.dict.wordnet.indexbyname.instance.f.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02188805\"]}");
	add("{\"term\":\"flea beetle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02172357\"]}");
	add("{\"term\":\"flea bite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04719195\", \"14311325\"]}");
	add("{\"term\":\"flea market\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08589445\"]}");
	add("{\"term\":\"fleabag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03367069\"]}");
	add("{\"term\":\"fleabane\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11976817\", \"11986096\", \"12026125\"]}");
	add("{\"term\":\"fleapit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03367139\"]}");
	add("{\"term\":\"fleawort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12620635\"]}");
	add("{\"term\":\"flecainide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03367239\"]}");
	add("{\"term\":\"fleck\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04689819\", \"09244958\"]}");
	add("{\"term\":\"flection\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07381571\", \"14059391\"]}");
	add("{\"term\":\"fledgeling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01506820\", \"10375148\"]}");
	add("{\"term\":\"fledgling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01506820\", \"10375148\"]}");
	add("{\"term\":\"fleece\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01902234\", \"03367485\", \"14787687\", \"15129319\"]}");
	add("{\"term\":\"fleer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06729056\", \"10134739\"]}");
	add("{\"term\":\"fleet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08309677\", \"08310257\", \"08310411\", \"08310752\"]}");
	add("{\"term\":\"fleet admiral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10115785\"]}");
	add("{\"term\":\"fleet ballistic missile submarine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03367617\"]}");
	add("{\"term\":\"fleet street\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06277286\", \"08589567\"]}");
	add("{\"term\":\"fleetingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05062840\"]}");
	add("{\"term\":\"fleetness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05066168\"]}");
	add("{\"term\":\"fleming\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09725528\", \"10992817\", \"10992977\"]}");
	add("{\"term\":\"flemish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06965467\", \"08500799\"]}");
	add("{\"term\":\"flemish dialect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06965467\"]}");
	add("{\"term\":\"flesh\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13116794\", \"05224424\", \"05275611\"]}");
	add("{\"term\":\"flesh fly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02195165\"]}");
	add("{\"term\":\"flesh wound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07355192\"]}");
	add("{\"term\":\"fleshiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05007507\"]}");
	add("{\"term\":\"fletc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08154010\"]}");
	add("{\"term\":\"fletcher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10993156\"]}");
	add("{\"term\":\"flex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00406449\"]}");
	add("{\"term\":\"flexeril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03160000\"]}");
	add("{\"term\":\"flexibility\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04912365\", \"04666644\", \"05029623\"]}");
	add("{\"term\":\"flexible joint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03526239\"]}");
	add("{\"term\":\"flexible sigmoidoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04224454\"]}");
	add("{\"term\":\"flexible sigmoidoscopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00644451\"]}");
	add("{\"term\":\"flexibleness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04666644\", \"05029623\"]}");
	add("{\"term\":\"flexion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00406181\", \"07381571\", \"14059391\"]}");
	add("{\"term\":\"flexor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05304002\"]}");
	add("{\"term\":\"flexor muscle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05304002\"]}");
	add("{\"term\":\"flexure\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00406181\", \"13930429\", \"14059391\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }