package org.swtk.commons.dict.wiktionary.generated.p.n.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPNE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pneudraulics", "{\"term\":\"pneudraulics\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|pneumatics|hydraulics|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The system on military aircraft that use either or some combination of both hydraulic and pneumatic systems\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The science of fluids made of both gas and liquid\", \"priority\":2}]}, \"synonyms\":{}}");

	add("pneuma", "{\"term\":\"pneuma\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027πνεῦμα\u0027 (lang\u003dgrc) from \u0027πνέω\u0027 (i blow, breathe)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a neum\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1922\u0027\u0027: With swaying arms they wail in \u0027\u0027pneuma\u0027\u0027 over the recreant Bloom. — James Joyce, \u0027Ulysses\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the spirit or sou\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"one of three levels of a human being, the spirit, along with the body and soul\", \"priority\":4}]}, \"synonyms\":{}}");

	add("pneumatique", "{\"term\":\"pneumatique\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027pneumatique\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The pneumatic postal system in Paris (abolished 1984), or a letter sent by this system\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1978\u0027\u0027, \u0027Livia\u0027, Faber \u0026amp; Faber 1992 (\u0027Avignon Quintet\u0027), p. 412\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Thus were great love-letters born – they would be sent by \u0027\u0027\u0027pneumatique\u0027\u0027\u0027 and a helmeted motor cyclist would deliver them, like Mercury himself, within the hour\", \"priority\":3}]}, \"synonyms\":{}}");

	add("pneumatograph", "{\"term\":\"pneumatograph\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|pneumato|graph|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An instrument for recording the movements of the thorax or chest wall during respiration\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pneumatometer", "{\"term\":\"pneumatometer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|pneumato|meter|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A device used to measure the force of inspiration or expiration of a person\u0027s lungs\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pneumatophore", "{\"term\":\"pneumatophore\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|pneumat|alt1\u003dpneumato|phore|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A gas-filled sac or float of some colonial marine coelenterates, such as the Portuguese man-of-war\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An aerial root, in mangroves etc., specialized for gaseous exchange\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An apparatus consisting of a bag with a tube and mouthpiece, which may be attached to the body. The bag contains oxygen to be breathed by the wearer in rescue work in mines, etc\", \"priority\":3}]}, \"synonyms\":{}}");

	add("pneumaturia", "{\"term\":\"pneumaturia\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"French\"], \"text\":\"{{confix|pneumat|uria|lang\u003den}}; compare French \u0027pneumaturie\u0027 German \u0027pneumaturie\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The presence of undissolved gases in the urine during urination\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pneumococcus", "{\"term\":\"pneumococcus\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|pneumo|coccus|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A gram-positive bacterium, \u0027Streptococcus pneumoniae\u0027, that causes pneumonia and other infectious diseases\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pneumology", "{\"term\":\"pneumology\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Modern Latin \u0027pneumologia\u0027 from Ancient greek (to 1453) \u0027πνεῦμα\u0027 (wind, breath, spirit) + \u0027-logia\u0027 (-logy)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of the respiratory system and organs\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pneumoperitoneum", "{\"term\":\"pneumoperitoneum\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|pneumo|peritoneum|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The presence of air or gas in the peritoneal cavity\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pneumothorax", "{\"term\":\"pneumothorax\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|pneumo|thorax|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Presence of air inside the pleural cavity, usually caused by injury either to the lung or the chest wall\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }