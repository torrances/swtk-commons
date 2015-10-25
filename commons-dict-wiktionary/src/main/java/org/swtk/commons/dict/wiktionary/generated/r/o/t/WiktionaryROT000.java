package org.swtk.commons.dict.wiktionary.generated.r.o.t;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryROT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("roto", "{\"term\":\"roto\", \"etymology\":{\"influencers\":[], \"languages\":[\"Esperanto\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ῥῶ\u0027 (the letter ρ)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Mark St. Amant, \u0027Committed: confession of a fantasy football junkie\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"quot;But that\u0027s just not an exciting quote, so they put on that \u0027\u0027roto\u0027\u0027 baseball guy saying disparaging things about fantasy football,\u0026quot; Emil concedes, referring to a roto baseball expert that HBO interviewed for the piec\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, \u0026quot;BGI bill\u0026quot;, \u0027Looking for Rules and Regulations for \u0027\u0027roto\u0027\u0027 baseball league\u0027 (on newsgroup \u0027pdaxs.sports.baseball\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Looking to find someone who has a comprehensive list of rules and regulations for \u0027\u0027Roto\u0027\u0027 baseball\", \"priority\":4}]}, \"synonyms\":{}}");

	add("rotamer", "{\"term\":\"rotamer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|rotation|isomer|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any of a set of conformers that arise from restricted rotation around a single bond\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rotarian", "{\"term\":\"rotarian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"* {{suffix|rotary|an|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of a w:Rotary Rotary Club\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rotgut", "{\"term\":\"rotgut\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|rot|gut|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"raw or poor quality alcoholic liquor\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rotifer", "{\"term\":\"rotifer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of many minute aquatic multicellular organisms, of the phylum \u0027Rotifera\u0027, that have a ring of cilia resembling a wheel\", \"priority\":1}]}, \"synonyms\":{}}");

	add("roton", "{\"term\":\"roton\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|rotation|on|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quantum of rotation in a superfluid\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rotodiffusion", "{\"term\":\"rotodiffusion\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"rotatory (gyrokinetic) diffusion\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rotoscope", "{\"term\":\"rotoscope\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A technique in which animators trace live live-action movement frame by frame\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rotter", "{\"term\":\"rotter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A worthless, despicable person\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A scoundrel\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A non-accredited journalist\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"date\u003d31 January url\u003dhttp://www.theguardian.com/football/2015/jan/31/chelsea-manchester-city-premier-league-match-report|passage\u003dpparently it was the fault of Jamie Redknapp and all the other \u0027\u0027rotters\u0027\u0027 in the media that Diego Costa was suspended and Mourinho, in turn, was applying his own ban\", \"priority\":4}]}, \"synonyms\":{}}");

	add("rotunda", "{\"term\":\"rotunda\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|rotunda}}, from \u0027Sancta Maria Rotunda\u0027 (the name for a church in the {{w|Pantheon, Rome|Pantheon}}), from {{m|la|rotundus||round}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a round building, usually small, often with a dom\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A Gothic typeface used in early printed books in Northern Italy, based on a rounded script developed in the 13th cent.; the manuscript hand on which this typeface was based\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }