package org.swtk.commons.dict.wordnet.index.name.instance.p.s.y.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePSYC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"psyche\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09600779\", \"10646444\", \"05619057\"]}");
	add("{\"term\":\"psychedelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08309219\"]}");
	add("{\"term\":\"psychiatrist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10507601\"]}");
	add("{\"term\":\"psychiatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06065477\"]}");
	add("{\"term\":\"psychic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10507894\"]}");
	add("{\"term\":\"psycho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10509726\"]}");
	add("{\"term\":\"psychoanalysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00705558\"]}");
	add("{\"term\":\"psychoanalyst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09809719\"]}");
	add("{\"term\":\"psychobabble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07086627\"]}");
	add("{\"term\":\"psychodid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02206630\"]}");
	add("{\"term\":\"psychodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02206391\"]}");
	add("{\"term\":\"psychodynamics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06151219\", \"13866715\"]}");
	add("{\"term\":\"psychogenesis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13564296\", \"13564434\"]}");
	add("{\"term\":\"psychokinesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07271713\"]}");
	add("{\"term\":\"psycholinguist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10508241\"]}");
	add("{\"term\":\"psycholinguistics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06150038\"]}");
	add("{\"term\":\"psychologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10508450\"]}");
	add("{\"term\":\"psychology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06145709\"]}");
	add("{\"term\":\"psychometrics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06150474\"]}");
	add("{\"term\":\"psychometrika\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06150474\"]}");
	add("{\"term\":\"psychometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06150474\"]}");
	add("{\"term\":\"psychoneurosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14416566\"]}");
	add("{\"term\":\"psychoneurotic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10374597\"]}");
	add("{\"term\":\"psychonomics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06148736\"]}");
	add("{\"term\":\"psychopath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10509149\"]}");
	add("{\"term\":\"psychopathology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06065477\", \"06147210\"]}");
	add("{\"term\":\"psychopathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14403545\"]}");
	add("{\"term\":\"psychopharmacology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06065355\"]}");
	add("{\"term\":\"psychophysicist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10509011\"]}");
	add("{\"term\":\"psychophysics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06148942\"]}");
	add("{\"term\":\"psychophysiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06150250\"]}");
	add("{\"term\":\"psychopomp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10509403\"]}");
	add("{\"term\":\"psychopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12100700\"]}");
	add("{\"term\":\"psychosexuality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05938796\"]}");
	add("{\"term\":\"psychosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14421471\"]}");
	add("{\"term\":\"psychosurgery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00668627\"]}");
	add("{\"term\":\"psychotherapeutics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06066454\"]}");
	add("{\"term\":\"psychotherapist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10509529\"]}");
	add("{\"term\":\"psychotherapy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00701905\", \"06066454\"]}");
	add("{\"term\":\"psychotic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10509726\"]}");
	add("{\"term\":\"psychotria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12690402\"]}");
	add("{\"term\":\"psychrometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04023965\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }